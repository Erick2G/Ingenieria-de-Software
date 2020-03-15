import sys
sys.path.insert(0,"./src")
import unittest
from Juego import Juego

class ProbarScore(unittest.TestCase):
	j = Juego()
	def test_prubaUno(self):
		self.j.setScore(4,5)
		self.assertEqual('2 has advantage',self.j.getScore());
	def test_prubaDos(self):
		self.j.setScore(3,3)
		self.assertEqual('empate',self.j.getScore());
	def test_prubaTres(self):
		self.j.setScore(2,3)
		self.assertEqual('2 3',self.j.getScore());
	def test_prubaCuatro(self):
		self.j.setScore(4,2)
		self.assertEqual('1 wins',self.j.getScore());
	def test_prubaCinco(self):
		self.j.setScore(4,6)
		self.assertEqual('2 wins',self.j.getScore());
	def test_prubaSeis(self):
		self.j.setScore(6,5)
		self.assertEqual('1 has advantage',self.j.getScore());