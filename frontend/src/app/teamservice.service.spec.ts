import { TestBed, inject } from '@angular/core/testing';

import { TeamserviceService } from './teamservice.service';

describe('TeamserviceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TeamserviceService]
    });
  });

  it('should be created', inject([TeamserviceService], (service: TeamserviceService) => {
    expect(service).toBeTruthy();
  }));
});
