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
public class Book {

  private String bookName;

  private String bookDesc;
}
