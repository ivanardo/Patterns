package structurial.facade;

import structurial.facade.facade.VideoConversionFacade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4video = converter.convertVideo("youtubervideo.ogg", "mp4");
    }
}
