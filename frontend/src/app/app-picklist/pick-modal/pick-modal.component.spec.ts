import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PickModalComponent } from './pick-modal.component';

describe('PickModalComponent', () => {
  let component: PickModalComponent;
  let fixture: ComponentFixture<PickModalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PickModalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PickModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
