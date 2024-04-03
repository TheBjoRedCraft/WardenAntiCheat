package dev.thebjoredcraft.wardenanticheat.anticheat.flag;

import java.util.Date;

public class Flag {
    public FlagType type;
    public Date date;
    public Flag(FlagType type, Date date){
        this.type = type;
    }

    public FlagType getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }
}
