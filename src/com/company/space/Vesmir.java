package com.company.space;

public class Vesmir {
    private boolean state;
    private long size;

    public Vesmir() {
    size = 0;
    state = false;
    }

    public void start(){
        System.out.println("SVET sa startol");
        increaseSize();
    }

    private void increaseSize(){
        while (size < 1000){
            size++;
        }
    }
    private void decreaseSize(long size){
        while (this.size < size){
            this.size++;
        }
        while (this.size > size){
            this.size--;
        }
    }
    public void stop(){
        System.out.println("SVET sa stopnul");
    }
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
