package io.github.luizns.temporizadorspring;

import io.github.luizns.temporizadorspring.utils.TimerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimerController {
    @Autowired
    private TimerService timerService;

    @PostMapping("/start-timer")
    public void startTimer() {
        timerService.startTimer();
    }

}