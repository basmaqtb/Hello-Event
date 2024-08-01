import { Component } from '@angular/core';
import { Utilisateur } from 'src/app/Module/Utilisateur';
import { JwtService } from 'src/app/Service/jwt.service';

@Component({
  selector: 'app-all-user',
  templateUrl: './all-user.component.html',
  styleUrls: ['./all-user.component.css']
})
export class AllUserComponent {

  users: Utilisateur[] | undefined;

  constructor(
    private service: JwtService
  ){}

  ngOnInit(): void {
    this.loadUsers();
  }

  private loadUsers(): void {
    this.service.getAllUsers().subscribe(
      (users: Utilisateur[]) => {
        this.users = users;
      },
      (error) => {
        console.error('Error fetching users', error);
      }
    );
  }
}
