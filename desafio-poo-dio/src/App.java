import java.time.LocalDate;

import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Curso Js");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Development");
        bootcamp.setDescricao("Descrição Bootcamp Java Development");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJr = new Dev();
        devJr.setNome("Junior");
        devJr.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Junior: "+ devJr.getConteudosInscritos());

        Dev devPleno = new Dev();
        devPleno.setNome("Pleno");
        devPleno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pleno: "+ devPleno.getConteudosInscritos());

    }
}
