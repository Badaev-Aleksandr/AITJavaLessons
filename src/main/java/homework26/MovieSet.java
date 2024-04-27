package homework26;

import java.util.ArrayList;

public class MovieSet {
    public static void main(String[] args) {
        ArrayList<FilmStudioEmployee> filmStudioEmployees = new ArrayList<>();
        CameraOperator cameraOperator = new CameraOperator("Nikolay","Camera Operator",15);
        Director director = new Director("Aleksandr","Director",10);
        SoundEngineer soundEngineer = new SoundEngineer("Elisaveta","Sound Engineer",7);
        filmStudioEmployees.add(cameraOperator);
        filmStudioEmployees.add(director);
        filmStudioEmployees.add(soundEngineer);

        for (FilmStudioEmployee filmStudioEmployee: filmStudioEmployees){
            filmStudioEmployee.work();
        }
        System.out.println("-------------");
        cameraOperator.operatorCamera();
        director.direct();
        soundEngineer.recordSound();

    }
}
