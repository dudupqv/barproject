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

import business.Bar;
import business.Cliente;
import business.Socio;


public class Teste extends Application {

    final SwingNode mapkit = new SwingNode();

    public void start(Stage primaryStage) throws Exception {

        Text text1 = new Text("Vamos começar um novo dia de trabalho? \nPor favor, informe a data de hoje no formato \"ddmmyy\"");


        TextField textField1 = new TextField();
        textField1.setAlignment(Pos.CENTER);

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
            Bar bar = new Bar(textField1.getText());

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
            Button percentualGenero = new Button("Percentual de Clientes por Gênero");
            Button percentualSocio = new Button("Percentual de Clientes por Status de Sócio");
            Button finalizarDia = new Button("Finalizar dia");

            gridPane1.add(cadastroCliente, 0, 0);
            gridPane1.add(removerCliente, 1, 0);
            gridPane1.add(percentualGenero, 0, 2);
            gridPane1.add(percentualSocio, 1, 2);
            gridPane1.add(listaDeClientes, 0, 4);
            gridPane1.add(finalizarDia, 1, 4);

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

                Text CPF = new Text();
                CPF.setText("CPF: ");
                pane.add(CPF, 0,0);
                TextField cpf = new TextField();
                pane.add(cpf, 1,0);

                Text GENERO = new Text();
                GENERO.setText("GÊNERO: ");
                pane.add(GENERO,0,2);
                ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(
                        'M', 'F')
                );
                pane.add(cb, 1,2);

                Text IDADE = new Text();
                IDADE.setText("IDADE: ");
                pane.add(IDADE, 0,4);
                TextField idade = new TextField();
                pane.add(idade, 1, 4);

                Text SOCIO = new Text();
                SOCIO.setText("Nº SÓCIO (opcional): ");
                pane.add(SOCIO, 0,6);
                TextField socio = new TextField();
                pane.add(socio, 1, 6);

                Button confirma = new Button("Confirmar");
                pane.add(confirma, 4, 0);

                Scene scene3 = new Scene(pane, 300, 275);
                stage.setScene(scene3);
                stage.show();

                confirma.setOnAction(e11 ->{
                    if(socio.getText().equals(" ")) bar.addCliente(new Cliente(Integer.parseInt(idade.getText()), cpf.getText(), ));
                    else bar.addCliente(new Cliente(Integer.parseInt(idade.getText()), cpf.getText(), idade, Integer.parseInt(socio.getText())));
                });

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

                Button confirma = new Button("Confirmar");
                pane.add(confirma, 4, 0);

                confirma.setOnAction(e11 ->{
                    bar.removeCliente(remove.getText());
                });

            });



            finalizarDia.setOnAction(e2 ->{
                bar.finalizarDia();
                System.exit(0);
            });

        });
    }


}