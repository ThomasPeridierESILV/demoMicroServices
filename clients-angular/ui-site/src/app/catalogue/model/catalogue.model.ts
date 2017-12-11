import {Produit} from "../../produits/model/produit.model";

export class Catalogue {
    private _id:number;
    private _produit:Produit;
    private _prix:number;
    private _disponible:boolean;

    get id(): number {
        return this._id;
    }

    set id(value: number) {
        this._id = value;
    }

    get produit(): Produit {
        return this._produit;
    }

    set produit(value: Produit) {
        this._produit = value;
    }

    get prix(): number {
        return this._prix;
    }

    set prix(value: number) {
        this._prix = value;
    }


    get disponible(): boolean {
        return this._disponible;
    }

    set disponible(value: boolean) {
        this._disponible = value;
    }
}