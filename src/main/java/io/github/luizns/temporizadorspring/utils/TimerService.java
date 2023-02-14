package io.github.luizns.temporizadorspring.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Timer;
import java.util.TimerTask;

@Slf4j
@Service
public class TimerService {
    private Timer timer;
    private int seconds;

    public void startTimer() {
        timer = new Timer();
        seconds = 60;
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                seconds--;
                log.info("Elapsed time in seconds: " + seconds);
                if (seconds == 0) {
                    timer.cancel();
                    log.info("Timer stopped... Finish");
                }
            }
        }, 0, 1000);
    }

}
