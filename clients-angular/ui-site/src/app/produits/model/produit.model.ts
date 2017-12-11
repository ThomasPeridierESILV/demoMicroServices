export class Produit {
   public _id: number;
    public _nom: string;
    public _poidsUnitaire: number;

    get id(): number {
        return this._id;
    }

    set id(value: number) {
        this._id = value;
    }

    get nom(): string {
        return this._nom;
    }

    set nom(value: string) {
        this._nom = value;
    }

    get poidsUnitaire(): number {
        return this._poidsUnitaire;
    }

    set poidsUnitaire(value: number) {
        this._poidsUnitaire = value;
    }
}