import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Spell } from '../../app/model/spell';  

@Injectable({
  providedIn: 'root'
})
export class SpellService {

  private apiUrl = 'http://localhost:8080/spellbook';

  constructor(private http: HttpClient) {}
  
    // Fetch all spells from the backend
    getAllSpells(): Observable<Spell[]> {
      return this.http.get<Spell[]>(this.apiUrl);
}
