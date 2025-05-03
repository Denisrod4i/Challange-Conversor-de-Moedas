import br.com.alura.desafioconversordemoedas.moedas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        Dolar dolar = new Dolar();
        PesoArgentino pesoArgentino = new PesoArgentino();
        RealBrasileiro realBrasileiro = new RealBrasileiro();
        BolivianoBoliviano bolivianoBoliviano = new BolivianoBoliviano();
        PesoChileno pesoChileno = new PesoChileno();
        PesoColombiano pesocolombiano = new PesoColombiano();
        String menuOpcoes = """
                *******************************************
                
                Seja bem vindo/a ao Conversor de Moedas :)
                
                Escolha uma das opções:
                
                1) Dólar Para Real
                2) Dólar Para Peso Argentino
                3) Dólar Para Boliviano Boliviano
                4) Dólar Para Peso Chileno
                5) Dólar Para Peso Colombiano
                6) Real Brasileiro Para Dólar
                7) Real Brasileiro Para Boliviano Boliviano
                8) Real Brasileiro Para Peso Argentino
                9) Real Brasileiro Para Peso Chileno
                10) Real Brasileiro Para Peso Colombiano
                11) Boliviano Boliviano Para Dólar
                12) Boliviano Boliviano Para Real
                13) Boliviano Boliviano Para Peso Argentino
                14) Boliviano Boliviano Para Peso Chileno
                15) Boliviano Boliviano Para Peso Colombiano
                16) Peso Argentino Para Dólar
                17) Peso Argentino Para Real
                18) Peso Argentino Para Boliviano Boliviano
                19) Peso Argentino Para Peso Chileno
                20) Peso Argentino Para Peso Colombiano
                21) Peso Chileno Para Peso Argentino
                22) Peso Chileno Para Peso Colombiano
                23) Peso Chileno Para Dólar
                24) Peso Chileno Para Real
                25) Peso Chileno Para Boliviano Boliviano
                26) Peso Colombiano Para Peso Chileno
                27) Peso Colombiano Para Peso Argentino
                28) Peso Colombiano Para Dólar
                29) Peso Colombiano Para Real
                30) Peso Colombiano Para Boliviano Boliviano
                31) SAIR
                
                *******************************************
                """;


        while (opcao != 30) {
            System.out.println(menuOpcoes);
            opcao = leitura.nextInt();
            switch (opcao){
                case 1:
                    dolar.converterDolarReal();
                    break;
                case 2:
                    dolar.converterDolarPesoArgentino();
                    break;
                case 3:
                    dolar.converterDolarBolivianoBoliviano();
                    break;
                case 4:
                    dolar.converterDolarPesoChileno();
                    break;
                case 5:
                    dolar.converterDolarPesoColombiano();
                    break;
                case 6:
                    realBrasileiro.converterRealDolar();
                    break;
                case 7:
                    realBrasileiro.converterRealPesoArgentino();
                    break;
                case 8:
                    realBrasileiro.converterRealBolivianoBoliviano();
                    break;
                case 9:
                    realBrasileiro.converterRealPesoChileno();
                    break;
                case 10:
                    realBrasileiro.converterRealPesoColombiano();
                    break;
                case 11:
                    bolivianoBoliviano.converterBolivianoBolivianoDolar();
                    break;
                case 12:
                    bolivianoBoliviano.converterBolivianoBolivianoReal();
                    break;
                case 13:
                    bolivianoBoliviano.converterBolivianoBolivianoPesoArgentino();
                    break;
                case 14:
                    bolivianoBoliviano.converterBolivianoBolivianoPesoChileno();
                    break;
                case 15:
                    bolivianoBoliviano.converterBolivianoBolivianoPesoColombiano();
                    break;
                case 16:
                    pesoArgentino.converterPesoArgentinoDolar();
                    break;
                case 17:
                    pesoArgentino.converterPesoArgentinoReal();
                    break;
                case 18:
                    pesoArgentino.converterPesoArgentinoBolivianoBoliviano();
                    break;
                case 19:
                    pesoArgentino.converterPesoArgentinoPesoChileno();
                    break;
                case 20:
                    pesoArgentino.converterPesoArgentinoPesoColombiano();
                    break;
                case 21:
                    pesoChileno.converterPesoChilenoPesoArgentino();
                    break;
                case 22:
                    pesoChileno.converterPesoChilenoPesoColombiano();
                    break;
                case 23:
                    pesoChileno.converterPesoChilenoDolar();
                    break;
                case 24:
                    pesoChileno.converterPesoChilenoReal();
                    break;
                case 25:
                    pesoChileno.converterPesoChilenoBolivianoBoliviano();
                    break;
                case 26:
                    pesocolombiano.converterPesoColombianoPesoChileno();
                    break;
                case 27:
                    pesocolombiano.converterPesoColombianoPesoArgentino();
                    break;
                case 28:
                    pesocolombiano.converterPesoColombianoDolar();
                    break;
                case 29:
                    pesocolombiano.converterPesoColombianoReal();
                    break;
                case 30:
                    pesocolombiano.converterPesoColombianoBolivianoBoliviano();
                    break;

                default:
                    System.out.println("Opção inválida, escolha novamente");
                    break;
            }
        }
        System.out.println("Programa encerrado!");
    }
}
