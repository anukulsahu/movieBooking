package com.bookmyshow.bookmyshowserver.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomResponse {
  private String message;
  private Object data;
}
