package model;

public enum PosicaoJogador {
    GUARDA_REDES {
        public String toString() {
            return "Guarda-Redes";
        }
    },
    DEFESA {
        public String toString() {
            return "Defesa";
        }
    },
    MEDIO {
        public String toString() {
            return "Médio";
        }
    },
    AVANCADO {
        public String toString() {
            return "Avançado";
        }
    };
}
