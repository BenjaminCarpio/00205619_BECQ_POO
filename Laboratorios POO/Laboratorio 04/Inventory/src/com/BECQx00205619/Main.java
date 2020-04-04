package com.BECQx00205619;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> PersonalItems = new ArrayList<>();
        ArrayList<Item> CommonItems = new ArrayList<>();
        int opc = 0, opcItem = 0, opcHealthItem = 0, opcLevelHealthItem = 0, amountHealthItem = 0, reuseTimeItem = 0, weightItem = 0, durationTimeItem;
        int opcReusableItem = 0, confirmDialog = 0, remainingUsesItem = 0, opcTypeWeapon = 0, opcWieldType = 0, levelWeapon = 0, itemIdShare = 0;
        boolean equipedAmmo = false;
        String itemName, descriptionItem, levelHealhItem, typeItem, typeWeapon, wieldType;
        double speedWeapon = 0, damageWeapon = 0;

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, menuDisplay()));
            switch (opc) {
                case 1:
                    do {
                        opcItem = Integer.parseInt(JOptionPane.showInputDialog(null, menuOpc1()));
                        if(opcItem == 1){
                            opcHealthItem = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Mana(Potion)\n2.Life(Elixir)"));
                            if(opcHealthItem == 1) {
                                typeItem = "Mana";
                                opcLevelHealthItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el nivel de la pocion: " +
                                        "\n1.Minor\n2.Normal\n3.Major"));
                                if(opcLevelHealthItem == 1)
                                    levelHealhItem = "Minor";
                                else if(opcLevelHealthItem == 2)
                                    levelHealhItem = "Normal";
                                else
                                    levelHealhItem = "Major";
                                amountHealthItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pociones a agregar"));
                                reuseTimeItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tiempo para reutilizar (segundos)"));
                                itemName = JOptionPane.showInputDialog(null, "Ingrese el nombre para su pocion:");
                                weightItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso para la pocion(kg)"));
                                descriptionItem = JOptionPane.showInputDialog(null, "Escriba una descripción para la pocion: ");
                                PersonalItems.add(new Potion(itemName,weightItem,descriptionItem,reuseTimeItem,levelHealhItem,typeItem,amountHealthItem));
                                break;
                            }else if (opcHealthItem == 2){
                                typeItem = "Elixir";
                                opcLevelHealthItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el nivel del elixir: " +
                                        "\n1.Minor\n2.Normal\n3.Major"));
                                if(opcLevelHealthItem == 1)
                                    levelHealhItem = "Minor";
                                else if(opcLevelHealthItem == 2)
                                    levelHealhItem = "Normal";
                                else
                                    levelHealhItem = "Major";
                                amountHealthItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de elixir que va a agregar"));
                                reuseTimeItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tiempo para reutilizar (segundos)"));
                                itemName = JOptionPane.showInputDialog(null, "Ingrese el nombre para su elixir:");
                                weightItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso para el elixir (kg)"));
                                descriptionItem = JOptionPane.showInputDialog(null, "Escriba una descripción para el elixir: ");
                                durationTimeItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso para el elixir (kg)"));
                                PersonalItems.add(new Elixir(itemName,weightItem,descriptionItem,reuseTimeItem,levelHealhItem,typeItem,amountHealthItem,durationTimeItem));
                                break;
                            }else
                                JOptionPane.showMessageDialog(null, "Opcion invalida");
                        } else if (opcItem == 2){
                            opcReusableItem = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Ammo\n2.Weapon"));
                            if(opcReusableItem == 1){
                                confirmDialog = JOptionPane.showConfirmDialog(null,"Equiped?\nMarque Si o No");
                                if(confirmDialog == JOptionPane.YES_OPTION)
                                    equipedAmmo = true;
                                else if(confirmDialog == JOptionPane.NO_OPTION)
                                    equipedAmmo = false;
                                remainingUsesItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos usos restantes tiene?"));
                                itemName = JOptionPane.showInputDialog(null, "Ingrese el nombre para el Ammo:");
                                weightItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso para el Ammo (kg)"));
                                descriptionItem = JOptionPane.showInputDialog(null, "Escriba una descripción para el Ammo: ");
                                PersonalItems.add(new Ammo(itemName,weightItem,descriptionItem,remainingUsesItem,equipedAmmo));
                                break;
                            }else if (opcReusableItem == 2){
                                remainingUsesItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos usos restantes tiene?"));
                                itemName = JOptionPane.showInputDialog(null, "Ingrese el nombre para el arma:");
                                weightItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el peso para el arma (kg)"));
                                descriptionItem = JOptionPane.showInputDialog(null, "Escriba una descripción para el arma: ");
                                opcTypeWeapon = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el tipo del arma: " +
                                        "\n1.Bow\n2.Sword\n3.Staff\n4.Orb\n5.Dagger"));
                                if(opcTypeWeapon == 1)
                                    typeWeapon = "Bow";
                                else if(opcTypeWeapon == 2)
                                    typeWeapon = "Sword";
                                else if(opcTypeWeapon == 3)
                                    typeWeapon = "Staff";
                                else if(opcTypeWeapon == 4)
                                    typeWeapon = "Orb";
                                else
                                    typeWeapon = "Dagger";
                                speedWeapon = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la velocidad de ataque del arma"));
                                damageWeapon = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el poder de ataque del arma"));
                                opcWieldType = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el tipo de eagarre para el arma: " +
                                        "\n1.One-Handed\n2.Two-Handed"));
                                if(opcWieldType == 1)
                                    wieldType = "One-Handed";
                                else
                                    wieldType = "Two-Handed";
                                levelWeapon = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el nivel del arma: "));
                                PersonalItems.add(new Weapon(itemName,weightItem,descriptionItem,remainingUsesItem,typeWeapon,speedWeapon,damageWeapon,wieldType,levelWeapon));
                                break;
                            }else
                                JOptionPane.showMessageDialog(null, "Opcion invalida");
                        }else if (opcItem == 3)
                            break;
                        else
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                    } while (opcItem != 3);
                    break;
                case 2:
                    itemIdShare = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del item que desea compartir: "));
                    int finalItemIdShare = itemIdShare;
                    PersonalItems.forEach(obj -> { if(obj.getID() == finalItemIdShare){
                        CommonItems.add(obj);
                        JOptionPane.showMessageDialog(null, "Item compartido exitosamente");
                    }else{
                        JOptionPane.showMessageDialog(null, "Id no encontrado");
                    }});
                    break;
                case 3:
                    int listaChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "En que lista desea buscar?\n1.Personal Items\n2.Common Items: "));
                    if (listaChoice == 1) {
                        int itemIdSearch = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del item que desea buscar: "));
                        int finalItemIdSearch = itemIdSearch;
                        PersonalItems.forEach(obj -> {
                            if (obj.getID() == finalItemIdSearch) {
                                JOptionPane.showMessageDialog(null, "Item: " + obj);
                            } else
                                JOptionPane.showMessageDialog(null, "Id no encontrado");
                        });
                    }else{
                        int itemIdSearch2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del item que desea buscar: "));
                        int finalItemIdSearch2 = itemIdSearch2;
                        CommonItems.forEach(obj -> {
                            if (obj.getID() == finalItemIdSearch2) {
                                JOptionPane.showMessageDialog(null, "Item: " + obj);
                            } else
                                JOptionPane.showMessageDialog(null, "Id no encontrado");
                        });

                    }
                    break;
                case 4:
                    int listaChoice2 = Integer.parseInt(JOptionPane.showInputDialog(null, "En que lista desea buscar?\n1.Personal Items\n2.Common Items: "));

                    if(listaChoice2 == 1) {
                        int itemTypeSearch = Integer.parseInt(JOptionPane.showInputDialog(null, "Que tipo de items desea buscar?" +
                                "\n1.Potion\n2.Elixir\n3.Ammo\n4.Weapon"));
                        switch (itemTypeSearch) {
                            case 1:
                                PersonalItems.forEach(obj -> {
                                    if (obj instanceof Potion) {
                                        JOptionPane.showMessageDialog(null, "items de ese tipo:\n" + obj);
                                    }
                                });
                                break;
                            case 2:
                                PersonalItems.forEach(obj -> {
                                    if (obj instanceof Elixir) {
                                        JOptionPane.showMessageDialog(null, "items de ese tipo:\n" + obj);
                                    }
                                });
                                break;
                            case 3:
                                PersonalItems.forEach(obj -> {
                                    if (obj instanceof Ammo) {
                                        JOptionPane.showMessageDialog(null, "items de ese tipo:\n" + obj);
                                    }
                                });
                                break;
                            case 4:
                                PersonalItems.forEach(obj -> {
                                    if (obj instanceof Weapon) {
                                        JOptionPane.showMessageDialog(null, "items de ese tipo:\n" + obj);
                                    }
                                });
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid option.");
                                break;
                        }
                    }else{
                        int itemTypeSearch = Integer.parseInt(JOptionPane.showInputDialog(null, "Que tipo de items desea buscar?" +
                                "\n1.Potion\n2.Elixir\n3.Ammo\n4.Weapon"));
                        switch (itemTypeSearch) {
                            case 1:
                                CommonItems.forEach(obj -> {
                                    if (obj instanceof Potion) {
                                        JOptionPane.showMessageDialog(null, "items de ese tipo:\n" + obj);
                                    }
                                });
                                break;
                            case 2:
                                CommonItems.forEach(obj -> {
                                    if (obj instanceof Elixir) {
                                        JOptionPane.showMessageDialog(null, "items de ese tipo:\n" + obj);
                                    }
                                });
                                break;
                            case 3:
                                CommonItems.forEach(obj -> {
                                    if (obj instanceof Ammo) {
                                        JOptionPane.showMessageDialog(null, "items de ese tipo:\n" + obj);
                                    }
                                });
                                break;
                            case 4:
                                CommonItems.forEach(obj -> {
                                    if (obj instanceof Weapon) {
                                        JOptionPane.showMessageDialog(null, "items de ese tipo:\n" + obj);
                                    }
                                });
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid option.");
                                break;
                        }
                    }
                    break;
                case 5:
                    int listaChoice3 = Integer.parseInt(JOptionPane.showInputDialog(null, "En que lista desea buscar?\n1.Personal Items\n2.Common Items: "));
                    if(listaChoice3 == 1) {
                        int itemIdDelete = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del item que desea eliminar: "));
                        int finalItemIdDelete = itemIdDelete;
                        PersonalItems.removeIf(Obj-> (Obj.getID() == finalItemIdDelete));
                        JOptionPane.showMessageDialog(null, "Item eliminado");

                    }else {
                        int itemIdDelete2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del item que desea eliminar: "));
                        int finalItemIdDelete2 = itemIdDelete2;
                        CommonItems.removeIf(Obj -> (Obj.getID() == finalItemIdDelete2));
                        JOptionPane.showMessageDialog(null, "Item eliminado");


                    }
                    break;
                case 6:
                    int listaChoice4 = Integer.parseInt(JOptionPane.showInputDialog(null, "En que lista desea buscar?\n1.Personal Items\n2.Common Items: "));
                    if(listaChoice4 == 1) {
                        int itemTypeDelete = Integer.parseInt(JOptionPane.showInputDialog(null, "Que tipo de items desea eliminar?" +
                                "\n1.Potion\n2.Elixir\n3.Ammo\n4.Weapon"));
                        PersonalItems.removeIf(obj -> obj instanceof Potion);
                        switch (itemTypeDelete) {
                            case 1:
                                PersonalItems.removeIf(obj -> obj instanceof Potion);
                                JOptionPane.showMessageDialog(null, "Items del tipo Potion eliminados.");
                                break;
                            case 2:
                                PersonalItems.removeIf(obj -> obj instanceof Elixir);
                                JOptionPane.showMessageDialog(null, "Items del tipo Elixir eliminados.");
                                break;
                            case 3:
                                PersonalItems.removeIf(obj -> obj instanceof Ammo);
                                JOptionPane.showMessageDialog(null, "Items del tipo Ammo eliminados.");
                                break;
                            case 4:
                                PersonalItems.removeIf(obj -> obj instanceof Weapon);
                                JOptionPane.showMessageDialog(null, "Items del tipo Weapon eliminados.");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid option.");
                                break;
                        }
                    }else{
                        int itemTypeDelete = Integer.parseInt(JOptionPane.showInputDialog(null, "Que tipo de items desea eliminar?" +
                                "\n1.Potion\n2.Elixir\n3.Ammo\n4.Weapon"));
                        PersonalItems.removeIf(obj -> obj instanceof Potion);
                        switch (itemTypeDelete) {
                            case 1:
                                CommonItems.removeIf(obj -> obj instanceof Potion);
                                JOptionPane.showMessageDialog(null, "Items del tipo Potion eliminados.");
                                break;
                            case 2:
                                CommonItems.removeIf(obj -> obj instanceof Elixir);
                                JOptionPane.showMessageDialog(null, "Items del tipo Elixir eliminados.");
                                break;
                            case 3:
                                CommonItems.removeIf(obj -> obj instanceof Ammo);
                                JOptionPane.showMessageDialog(null, "Items del tipo Ammo eliminados.");
                                break;
                            case 4:
                                CommonItems.removeIf(obj -> obj instanceof Weapon);
                                JOptionPane.showMessageDialog(null, "Items del tipo Weapon eliminados.");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid option.");
                                break;
                        }
                    }
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Cerrando programa.....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } while (opc != 7);
    }

    static String menuDisplay() {
        return "1. Agregar item\n2. Compartir item\n3. Buscar item por ID\n4. Buscar item por tipo\n5. Borrar item por ID" +
                "\n6. Borrar item por tipo\n7. Salir\n";
    }

    static String menuOpc1() {
        return "Que tipo de item desea agregar?\n1. Health item\n2. Reusable item\n3. Volver al menu.";
    }
}
