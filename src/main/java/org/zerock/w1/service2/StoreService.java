package org.zerock.w1.service2;

import org.zerock.w1.dto.StoreDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum StoreService {

    INSTANCE;

    private List<StoreDTO> dtoList;

    StoreService() {
        dtoList = new ArrayList<>();

        this.add(StoreDTO.builder().name("북창동순두부").area("종각").desc("").build());
        this.add(StoreDTO.builder().name("더비기닝").area("인천").desc("").build());
        this.add(StoreDTO.builder().name("청수산").area("인천").desc("").build());
        this.add(StoreDTO.builder().name("키오쿠").area("홍대").desc("").build());
    }

    public void add(StoreDTO storeDTO) {
        this.dtoList.add(storeDTO);
    }

    public List<StoreDTO> getDtoList(String area) {
        if (area == null || area.trim().length() == 0) {
            return this.dtoList;
        }
        return this.dtoList.stream().filter(storeDTO -> storeDTO.getArea().equals(area))
                .collect(Collectors.toList());
    }

}
