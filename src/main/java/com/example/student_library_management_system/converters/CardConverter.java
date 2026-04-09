package com.example.student_library_management_system.converters;

import com.example.student_library_management_system.model.Card;
import com.example.student_library_management_system.requestdto.CardRequestDto;

public class CardConverter {
    public static Card convertCardRequestDtoIntoCard(CardRequestDto cardRequestDto){
        return Card.builder()
                .cardStatus(cardRequestDto.getCardStatus())
                .build();
    }
}
