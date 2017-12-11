import {Client} from "../../client/model/client.model";
import {Produit} from "../../produits/model/produit.model";

export class Commande {
    public _id:number;
    public _client:Client;
    public _produit:Produit;
    public _quantite:number;
    public _prix:number;


    get id(): number {
        return this._id;
    }

    set id(value: number) {
        this._id = value;
    }

    get client(): Client {
        return this._client;
    }

    set client(value: Client) {
        this._client = value;
    }

    get produit(): Produit {
        return this._produit;
    }

    set produit(value: Produit) {
        this._produit = value;
    }

    get quantite(): number {
        return this._quantite;
    }

    set quantite(value: number) {
        this._quantite = value;
    }

    get prix(): number {
        return this._prix;
    }

    set prix(value: number) {
        this._prix = value;
    }
}