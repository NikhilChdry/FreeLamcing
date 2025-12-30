package com.BugFix.freeLancing.videocall;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class VideoCallController {

    @MessageMapping("/video.signal/{roomId}")
    @SendTo("/topic/video/{roomId}")
    public VideoSignal handleSignal(
            @DestinationVariable String roomId,
            VideoSignal signal
    ) {
        signal.setRoomId(roomId);
        return signal;
    }
}
