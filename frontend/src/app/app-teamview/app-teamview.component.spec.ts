import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppTeamviewComponent } from './app-teamview.component';

describe('AppTeamviewComponent', () => {
  let component: AppTeamviewComponent;
  let fixture: ComponentFixture<AppTeamviewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppTeamviewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppTeamviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
