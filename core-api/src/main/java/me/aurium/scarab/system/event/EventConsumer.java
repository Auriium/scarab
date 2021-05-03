package me.aurium.scarab.system.event;

import me.aurium.scarab.AspectData;

public interface EventConsumer<DATA extends AspectData, EVENT extends Event> {

    void consume(DATA data, EVENT event);

}
