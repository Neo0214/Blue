package io.github.neo0214;


/*
 * @author Neo0214
 */
public class BlueInteger {
    private int value;

    public BlueInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public BlueInteger add(BlueInteger other) {
        return new BlueInteger(this.value + other.value);
    }

    public BlueInteger subtract(BlueInteger other) {
        return new BlueInteger(this.value - other.value);
    }

    public BlueInteger multiply(BlueInteger other) {
        return new BlueInteger(this.value * other.value);
    }

    public BlueInteger divide(BlueInteger other) {
        return new BlueInteger(this.value / other.value);
    }

    public BlueInteger pow(BlueInteger other) {
        return new BlueInteger((int) Math.pow(this.value, other.value));
    }

    public BlueInteger mod(BlueInteger other) {
        return new BlueInteger(this.value % other.value);
    }

    public BlueInteger abs() {
        return new BlueInteger(Math.abs(this.value));
    }

    public BlueInteger negate() {
        return new BlueInteger(-this.value);
    }

    public BlueInteger increment() {
        return new BlueInteger(this.value + 1);
    }

    public BlueInteger decrement() {
        return new BlueInteger(this.value - 1);
    }

    public BlueInteger max(BlueInteger other) {
        return new BlueInteger(Math.max(this.value, other.value));
    }

    public BlueInteger min(BlueInteger other) {
        return new BlueInteger(Math.min(this.value, other.value));
    }

    public BlueInteger clamp(BlueInteger min, BlueInteger max) {
        return new BlueInteger(Math.min(Math.max(this.value, min.value), max.value));
    }

    public BlueInteger signum() {
        return new BlueInteger(Integer.signum(this.value));
    }

    public BlueInteger shiftLeft(BlueInteger other) {
        return new BlueInteger(this.value << other.value);
    }

    public BlueInteger shiftRight(BlueInteger other) {
        return new BlueInteger(this.value >> other.value);
    }

    public BlueInteger and(BlueInteger other) {
        return new BlueInteger(this.value & other.value);
    }

    public BlueInteger or(BlueInteger other) {
        return new BlueInteger(this.value | other.value);
    }

    public BlueInteger xor(BlueInteger other) {
        return new BlueInteger(this.value ^ other.value);
    }

}
