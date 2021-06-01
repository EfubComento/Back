package EFUB.commento.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDto {
    @JsonProperty
    String message;

    public ResponseDto(String message){
        this.message= message;
    }
}
