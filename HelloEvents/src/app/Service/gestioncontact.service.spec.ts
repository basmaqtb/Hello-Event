import { TestBed } from '@angular/core/testing';

import { GestioncontactService } from './gestioncontact.service';

describe('GestioncontactService', () => {
  let service: GestioncontactService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GestioncontactService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
