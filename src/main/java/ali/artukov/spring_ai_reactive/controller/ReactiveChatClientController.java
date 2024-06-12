package ali.artukov.spring_ai_reactive.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Log4j2
@RestController
@RequestMapping("/reactive-chat")
@RequiredArgsConstructor
public class ReactiveChatClientController {

    private final ChatClient chatClient;

    @GetMapping
    public Flux<String> get(@RequestParam(value = "message", defaultValue = "Write list of all versions of Java with their top features") String message) {
        log.info("Customer: {}", message);
        return chatClient
                .prompt()
                .user(message)
                .stream().content();
    }
}
