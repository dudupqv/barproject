package uinterface;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import javax.swing.SwingUtilities;

import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Modality;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingNode;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Teste extends Application {

    final SwingNode mapkit = new SwingNode();

    public void start(Stage primaryStage) throws Exception {

        //creating label email
        Text text1 = new Text("Vamos começar um novo dia de trabalho? \nPor favor, informe a data de hoje no formato \"ddmmyy\"");


        //Creating Text Filed for email
        TextField textField1 = new TextField();
        textField1.setAlignment(Pos.CENTER);

        //Creating Buttons
        Button button1 = new Button("Começar");

        primaryStage.setTitle("Bar Project");

        BorderPane panePrincipal = new BorderPane();
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(400, 200);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(button1, 1, 2);


        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();

        Scene scene2 = new Scene(panePrincipal, 550, 550);


        button1.setOnAction(e -> {
            GridPane gridPane1 = new GridPane();
            //Setting size for the pane
            gridPane1.setMinSize(400, 200);

            //Setting the padding
            gridPane1.setPadding(new Insets(10, 10, 10, 10));

            //Setting the vertical and horizontal gaps between the columns
            gridPane1.setVgap(5);
            gridPane1.setHgap(5);

            //Setting the Grid alignment
            gridPane1.setAlignment(Pos.CENTER);

            Button cadastroCliente = new Button("Cadastrar Cliente");
            Button removerCliente = new Button("Remover Cliente");
            Button listaDeClientes = new Button("Lista de Clientes");
            Button finalizarDia = new Button("Finalizar dia");

            gridPane1.add(cadastroCliente, 0, 0);
            gridPane1.add(removerCliente, 1, 0);
            gridPane1.add(listaDeClientes, 0, 2);
            gridPane1.add(finalizarDia, 1, 2);

            Scene scene1 = new Scene(gridPane1);
            primaryStage.setScene(scene1);
            primaryStage.show();


            cadastroCliente.setOnAction(e1 ->{
                Stage stage = new Stage();
                stage.setTitle("CADASTRO DE CLIENTE");
                GridPane pane = new GridPane();
                pane.setAlignment(Pos.CENTER);
                pane.setHgap(3);
                pane.setVgap(3);
                pane.setPadding(new Insets(25, 25, 25, 25));

                Text NOME = new Text();
                NOME.setText("NOME: ");
                pane.add(NOME, 0,0);
                TextField nome = new TextField();
                pane.add(nome, 1,0);

                Text CPF = new Text();
                CPF.setText("CPF: ");
                pane.add(CPF, 0,2);
                TextField cpf = new TextField();
                pane.add(cpf, 1,2);

                Text GENERO = new Text();
                GENERO.setText("GÊNERO: ");
                pane.add(GENERO,0,4);
                ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(
                        "M", "F")
                );
                pane.add(cb, 1,4);

                Text IDADE = new Text();
                IDADE.setText("IDADE: ");
                pane.add(IDADE, 0,6);
                TextField idade = new TextField();
                pane.add(idade, 1, 6);

                Text SOCIO = new Text();
                SOCIO.setText("SE SÓCIO: ");
                pane.add(SOCIO, 0,8);
                TextField socio = new TextField();
                pane.add(socio, 1, 8);


                Scene scene3 = new Scene(pane, 300, 275);
                stage.setScene(scene3);
                stage.show();
            });

            removerCliente.setOnAction(e2 ->{
                Stage stage = new Stage();
                stage.setTitle("REMOVER CLIENTE");
                GridPane pane = new GridPane();
                pane.setAlignment(Pos.CENTER);
                pane.setHgap(3);
                pane.setVgap(3);
                pane.setPadding(new Insets(15, 15, 15, 15));

                Text REMOVE = new Text();
                REMOVE.setText("CPF CLIENTE: ");
                pane.add(REMOVE, 0, 0);
                TextField remove = new TextField();
                pane.add(remove, 1,0);

                Scene scene4 = new Scene(pane, 300, 275);
                stage.setScene(scene4);
                stage.show();

            });

        });
    }


}