package myprogramme.todolist;

import javax.sound.midi.*;

public class Sound {
    //TODO в процессе

    public void getSequencer() throws MidiUnavailableException, InvalidMidiDataException {
        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.open();

        Sequence sequence = new Sequence(Sequence.PPQ, 4);
        Track track = sequence.createTrack();

        ShortMessage a1 = new ShortMessage();
        a1.setMessage(192, 1, 102, 20);
        MidiEvent note1 = new MidiEvent(a1, 1);
        track.add(note1);

        ShortMessage a2 = new ShortMessage();
        a2.setMessage(144, 1, 30, 20);
        MidiEvent note2 = new MidiEvent(a2, 2);
        track.add(note2);

        ShortMessage a3 = new ShortMessage();
        a3.setMessage(192, 1, 80, 20);
        MidiEvent note3 = new MidiEvent(a3, 1);
        track.add(note3);

        ShortMessage a4 = new ShortMessage();
        a4.setMessage(144, 1, 20, 20);
        MidiEvent note4 = new MidiEvent(a4, 1);
        track.add(note4);

        ShortMessage a5 = new ShortMessage();
        a5.setMessage(192, 1, 10, 20);
        MidiEvent note5 = new MidiEvent(a5, 2);
        track.add(note5);

        ShortMessage b = new ShortMessage();
        b.setMessage(128, 1, 44, 20);
        MidiEvent noteOff = new MidiEvent(b, 2);
        track.add(noteOff);

        sequencer.setSequence(sequence);
        sequencer.start();
    }
}
