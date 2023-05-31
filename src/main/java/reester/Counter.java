package reester;

import java.io.IOException;

class Counter implements AutoCloseable{

    private int counter;
    private boolean isOpen;

    public int getCounter(){
        return counter;
    }

    public Counter(){
        this.counter = 0;
        isOpen = true;
    }


    public int add() throws closeCounterException{
        if(!isOpen){
            throw new closeCounterException("Счетчик закрыт");
        }
        return this.counter++;
    }

    public void closeCounter(){
        isOpen = false;
    }

    @Override
    public void close() {
        closeCounter();

    }
}

