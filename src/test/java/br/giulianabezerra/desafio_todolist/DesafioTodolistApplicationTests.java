package br.giulianabezerra.desafio_todolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.giulianabezerra.desafio_todolist.entity.Todo;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DesafioTodolistApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testCreateTodoSuccess() {
        var todo = new Todo("todo 1", "desc todo 1", false, 1);

        webTestClient
            .post()
            .uri("/todos")
            .bodyValue(todo)
            .exchange()
            .expectStatus().isOk()
            .expectBody()
            .jsonPath("$[0].name").isEqualTo(todo.getName())
            .jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
            .jsonPath("$[0].realizado").isEqualTo(todo.isRealizado())
            .jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
    }

    @Test
    void testCreateTodoFailure() {
        webTestClient
            .post()
            .uri("/todos")
            .bodyValue(new Todo("todo1", "desc todo 1", false, 0))
            .exchange()
            .expectStatus().isBadRequest();
    }
}
