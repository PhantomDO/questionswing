package org.cnam.nfp121.question_swing_temp.datas;

import org.cnam.nfp121.question_swing_temp.datas.Clue;

public class ClueGeneric<T> extends Clue {
    private T clue;
    public T getClue() {
        return clue;
    }

    public ClueGeneric(Integer id, T indice) {
        super(id);
        this.clue = indice;
    }
}
