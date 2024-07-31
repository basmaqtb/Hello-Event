import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Jwt } from '../Module/Jwt';


const url = ["http://localhost:8085/api/v1/auth/"]
@Injectable({
  providedIn: 'root'
})
export class JwtService {

  constructor(private http: HttpClient) { }

  registerAdmin(singRequest: any): Observable<Jwt> {
    return this.http.post<Jwt>(url + 'registerAdmin', singRequest);
  }
  
  register(singRequest:any): Observable<Jwt>{
    return this.http.post<Jwt>(url+'register', singRequest)
  }


}
