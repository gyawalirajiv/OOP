package com.rajiv.jukebox;

public class RadioStation {
    private RadioFrequencyProtocol radioFrequencyProtocol;
    private Double frequency;

    public RadioStation() {
        this.radioFrequencyProtocol = RadioFrequencyProtocol.FM;
        this.frequency = 0.0;
    }

    public RadioFrequencyProtocol getRadioFrequencyProtocol() {
        return radioFrequencyProtocol;
    }

    public void setRadioFrequencyProtocol(RadioFrequencyProtocol radioFrequencyProtocol) {
        this.radioFrequencyProtocol = radioFrequencyProtocol;
    }

    public Double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }
}
