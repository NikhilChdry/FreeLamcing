package com.BugFix.freeLancing.videocall;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoSignal {

    private String roomId;
    private String sender;
    private String type;   // JOIN, LEAVE, OFFER, ANSWER, ICE
    private String data;   // SDP or ICE or empty
}
