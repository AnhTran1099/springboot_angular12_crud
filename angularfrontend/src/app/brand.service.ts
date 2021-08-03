import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Brand } from './brand/model/brand';

@Injectable({
  providedIn: 'root'
})
export class BrandService {


  constructor(private http:HttpClient) { }
  private baseUrl =  'http://localhost:8081/brand/list';

  public findAll(): Observable<Brand[]> {
    return this.http.get<Brand[]>(this.baseUrl);
  }

  // public save(user: User) {
  //   return this.http.post<User>(this.usersUrl, user);
  // }

}


