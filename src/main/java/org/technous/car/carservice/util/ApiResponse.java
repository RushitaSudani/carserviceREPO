package org.technous.car.carservice.util;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApiResponse {
        private String message;
        private int statuscode;
        private Object response;

}
