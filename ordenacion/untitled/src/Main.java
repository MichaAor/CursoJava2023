public class Main {
    public static void main(String[] args) {
        //declaracion de variables
        Departamento[] arrayDepartamento = new Departamento[3];
        arrayDepartamento[0] = new Departamento("1");
        arrayDepartamento[1] = new Departamento("2");
        arrayDepartamento[2] = new Departamento("3");
        seleccionMayorMenor(arrayDepartamento);
        mostrarArray(arrayDepartamento);
    }
    public static void seleccionMayorMenor(Departamento[] arrDepartamentos){

            int n = arrDepartamentos.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (Departamento.comparaDepto(arrDepartamentos[j],arrDepartamentos[minIndex]) ){
                        minIndex = j;
                    }
                }

                Departamento temp = arrDepartamentos[minIndex];
                arrDepartamentos[minIndex] = arrDepartamentos[i];
                arrDepartamentos[i] = temp;
            }
        }

    public static void mostrarArray(Departamento[] arrDepartamentos){
        for(Departamento p : arrDepartamentos)
        { System.out.println("\033[32m" + p + "\u001B[0m"); }
    }

}