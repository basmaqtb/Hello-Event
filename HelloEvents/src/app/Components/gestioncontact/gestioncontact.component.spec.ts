import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestioncontactComponent } from './gestioncontact.component';

describe('GestioncontactComponent', () => {
  let component: GestioncontactComponent;
  let fixture: ComponentFixture<GestioncontactComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GestioncontactComponent]
    });
    fixture = TestBed.createComponent(GestioncontactComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
