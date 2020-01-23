package com.ps.patterns.structural.bridge.shape2;

public abstract class Shape {

  protected Color color;

  public Shape(Color color) {
    this.color = color;
  }

  abstract void applyColor();
}
