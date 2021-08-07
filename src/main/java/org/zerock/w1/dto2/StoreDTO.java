package org.zerock.w1.dto2;


import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString

public class StoreDTO {

    private String name;
    private String area;
    private String desc;
    private String link;

}

