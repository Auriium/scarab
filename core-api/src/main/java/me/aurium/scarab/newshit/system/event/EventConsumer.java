package me.aurium.scarab.newshit.system.event;

import me.aurium.scarab.newshit.AspectData;

public interface EventConsumer<DATA extends AspectData, EVENT extends Event> {

    void consume(DATA data, EVENT event);

}
