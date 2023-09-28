import pytest
import fonctions as f

def test_1():
	assert f.puiss(2,3) == 6
	assert f.puiss(2,2) == 2
	
def test_2( ) :
	assert f.puissance (-2, -3) == -6
	assert f.puissance (-2, -2) == -2
