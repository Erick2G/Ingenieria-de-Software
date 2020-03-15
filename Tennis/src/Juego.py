class Juego:
	def __init__(self):
		self.score = [{'puntos':0,'ventaja': False},{'puntos':0,'ventaja': False}]

	def setScore(self, uno, dos):
		self.score[0]['puntos']=uno
		self.score[1]['puntos']=dos

	def getScore(self):
		if self.score[0]['puntos']>self.score[1]['puntos']and self.score[0]['puntos']>=4 or self.score[0]['puntos']<self.score[1]['puntos']and self.score[1]['puntos']>=4:
			diferencia =  self.score[0]['puntos']-self.score[1]['puntos']
			positivo = diferencia
			mayor = '1' #por la diferencia
			if diferencia < 0:
				mayor = '2'
				positivo *=-1
			if positivo >= 2:
				return mayor+' wins'
			elif positivo == 1:
				return mayor+' has advantage'
		elif self.score[0]['puntos']==self.score[1]['puntos']:
			return 'empate'
		else:
			return str(self.score[0]['puntos'])+' '+str(self.score[1]['puntos'])

		return ganador