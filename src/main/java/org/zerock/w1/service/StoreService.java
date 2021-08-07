package org.zerock.w1.service;

import org.zerock.w1.dto.StoreDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum StoreService {       //  객체의 수를 제한. 외부에서 맘대로 객체를 못 만짐.

    INSTANCE;//enum은 대문자로 정의

    private List<StoreDTO> dtoList;

    StoreService() {
        dtoList = new ArrayList<>();

        this.add(StoreDTO.builder().name("수정식당").area("종각").desc("불백").build());
        this.add(StoreDTO.builder().name("창매족").area("석계").desc("족발").build());
        this.add(StoreDTO.builder().name("아리닭발").area("김포").desc("닭발").build());
        this.add(StoreDTO.builder().name("은행나무집").area("종각").desc("한우국밥").build());


    }

    public void add(StoreDTO storeDTO) {  //Store(클래스명,설계도.틀) 급식차 store(설계도로 만들어낸 제품) 식판(Store)  붕어빵틀과 붕어빵
        this.dtoList.add(storeDTO);//this.이 생략
    }  //StorDTO 라는 형식의 storeDTO 변수명

    public List<StoreDTO> getDtoList(String area) { //목록불러오기

        if (area == null || area.trim().length() == 0) {  // 시청이면 목록을 불러오는데 값이 없거나. 값의 길이가 없으면.
            return this.dtoList;
        }
        return this.dtoList.stream().filter(storeDTO -> storeDTO.getArea().equals(area))
                .collect(Collectors.toList());

    }


}