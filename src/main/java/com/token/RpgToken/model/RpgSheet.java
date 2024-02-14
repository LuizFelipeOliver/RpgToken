package com.token.RpgToken.model;

import jakarta.persistence.Entity;

@Entity
public class RpgSheet {
    private Long id;
    private String nameCharacter;
    private String namePLayer;
    private String race;
    private String origin;
    private String characterClass;
    private int level;
    private String divinity;
    private int strong;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int health;
    private int mana;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCharacter() {
        return nameCharacter;
    }

    public void setNameCharacter(String nameCharacter) {
        this.nameCharacter = nameCharacter;
    }

    public String getNamePLayer() {
        return namePLayer;
    }

    public void setNamePLayer(String namePLayer) {
        this.namePLayer = namePLayer;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= 1 && level <= 20){
            this.level = level;
        }
        throw new IllegalArgumentException("O nível deve estar entre 1 e 20.");
    }

    public String getDivinity() {
        return divinity;
    }

    public void setDivinity(String divinity) {
        this.divinity = divinity;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public RpgSheet(
            Long id,
            String nameCharacter,
            String namePLayer,
            String race, String origin,
            String characterClass,
            int level,
            String divinity,
            int strong,
            int dexterity,
            int constitution,
            int intelligence,
            int wisdom,
            int charisma,
            int health,
            int mana
    ) {
        this.id = id;
        this.nameCharacter = nameCharacter;
        this.namePLayer = namePLayer;
        this.race = race;
        this.origin = origin;
        this.characterClass = characterClass;
        this.level = level;
        this.divinity = divinity;
        this.strong = strong;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.health = health;
        this.mana = mana;
    }

    public  enum Race{
        Human,
        DWARF,
        Dahllan,
        Elf,
        Goblin,
        Lefou,
        Minotaur,
        Qareen,
        Golem,
        Hynne,
        Kliren,
        Medusa,
        Osteon,
        MermaidTriton,
        Sílfide,
        Suraggels,
        Trog

    }

    public enum CharacterClass{
        Arcanist,
        Barbarian,
        Bard,
        Buccaneer,
        Hunter,
        Knight,
        Cleric,
        Druid,
        Warrior,
        Inventor,
        Rogue,
        Fighter,
        Noble,
        Paladin
    }


}
