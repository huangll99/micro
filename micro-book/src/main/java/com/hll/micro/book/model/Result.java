package com.hll.micro.book.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: huangll
 * Written on 18/5/16.
 */
@Getter
@Setter
@Builder
public class Result {

  private boolean success;

  private String msg;

}
