package poo;

import java.io.*;
import java.util.ArrayList;
import poo.Exceptions.*;

public class Database {

    public static final String FILE_PATH = "./data/";
    public static final String artistaDB = "artistasDB.dat";
    public static final String espetaculosDB = "espetaculosDB.dat";

    public static void guardarDados(ArrayList<Artista> listaArtista, ArrayList<Espetaculo> listaEspetaculo) {

        try {
            File f = new File("./data/");
            f.mkdir();
            ObjectOutputStream osA = new ObjectOutputStream(new FileOutputStream(FILE_PATH + artistaDB));
            ObjectOutputStream osE = new ObjectOutputStream(new FileOutputStream(FILE_PATH + espetaculosDB));

            osA.writeObject(listaArtista);
            osE.writeObject(listaEspetaculo);

            osA.flush();
            osE.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Artista> lerArtistas(ArrayList<Artista> listaArtista) {
        boolean exists = (new File(FILE_PATH + artistaDB)).exists();
        try {
            if (exists == true) {
                ObjectInputStream is = new ObjectInputStream(new FileInputStream(FILE_PATH + artistaDB));
                listaArtista = (ArrayList<Artista>) is.readObject();
            }
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }
        return listaArtista;

    }

    public static ArrayList<Espetaculo> lerEspetaculos(ArrayList<Espetaculo> listaEspetaculo) {
        boolean exists = (new File(FILE_PATH + espetaculosDB)).exists();
        try {
            if (exists == true) {
                ObjectInputStream is = new ObjectInputStream(new FileInputStream(FILE_PATH + espetaculosDB));
                listaEspetaculo = (ArrayList<Espetaculo>) is.readObject();
            }
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }
        return listaEspetaculo;
    }

    public static ArrayList<Artista> adicionarArtista(ArrayList<Artista> listaArtistas, Artista a) throws ArtistaDuplicadoException {
        for (int i = 0; i < listaArtistas.size(); i++) {
            if (listaArtistas.get(i).getId() == a.getId()) {
                throw new ArtistaDuplicadoException("O artista que tentou adicionar ja existe!!");
            }
        }
        listaArtistas.add(a);
        return listaArtistas;
    }

    public static Artista acharArtistaPorID(ArrayList<Artista> listaArtistas, int id) throws ArtistaNaoEncontradoException {
        for (int i = 0; i < listaArtistas.size(); i++) {
            if (listaArtistas.get(i).getId() == id) {
                return listaArtistas.get(i);
            }
        }
        throw new ArtistaNaoEncontradoException("O artista que procura nao existe!");
    }

    public static ArrayList<Artista> removerArtistaID(ArrayList<Artista> listaArtistas, Artista a) throws ArtistaNaoEncontradoException {

        if (listaArtistas.indexOf(a) != -1) {
            listaArtistas.remove(listaArtistas.indexOf(a));
            return listaArtistas;
        } else {
            throw new ArtistaNaoEncontradoException("O artista que esta tentando remover nao existe!");
        }

    }

    public static ArrayList<Espetaculo> adicionarEspetaculo(ArrayList<Espetaculo> listaEspetaculos, Espetaculo e) throws EspetaculoDuplicadoException {
        for (int i = 0; i < listaEspetaculos.size(); i++) {
            if (listaEspetaculos.get(i).getId() == e.getId()) {
                throw new EspetaculoDuplicadoException("O espetaculo que tentou adicionar ja existe!!");
            }
        }
        listaEspetaculos.add(e);
        return listaEspetaculos;
    }

    public static Espetaculo acharEspetaculoPorID(ArrayList<Espetaculo> listaEspetaculos, int id) throws EspetaculoNaoEncontradoException {
        for (int i = 0; i < listaEspetaculos.size(); i++) {
            if (listaEspetaculos.get(i).getId() == id) {
                return listaEspetaculos.get(i);
            }
        }
        throw new EspetaculoNaoEncontradoException("O espetaculo que procura nao existe!");
    }

    public static ArrayList<Espetaculo> removerEspetaculoID(ArrayList<Espetaculo> listaEspetaculos, Espetaculo a) throws EspetaculoNaoEncontradoException {

        if (listaEspetaculos.indexOf(a) != -1) {
            listaEspetaculos.remove(listaEspetaculos.indexOf(a));
            return listaEspetaculos;
        } else {
            throw new EspetaculoNaoEncontradoException("O espetaculo que esta tentando remover nao existe!");
        }
    }

    public static ArrayList<Artista> limparArtistas(ArrayList<Artista> listaArtistas) throws ListaVaziaException {

        if (listaArtistas.size() == 0) {
            throw new ListaVaziaException("A database ja se encontra vazia!");
        }
       listaArtistas.clear();

        return listaArtistas;
    }

    public static ArrayList<Espetaculo> limparEspetaculos(ArrayList<Espetaculo> listaEspetaculo) throws ListaVaziaException {

        if (listaEspetaculo.size() == 0) {
            throw new ListaVaziaException("A database ja se encontra vazia!");
        }
        listaEspetaculo.clear();

        return listaEspetaculo;
    }


}
