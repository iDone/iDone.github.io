static main(void)
{
	auto fp, begin, end, dexbyte;
	path = "d:\\classes-360.dex"  //�ļ�·��
	fp = fopen(path, "wb"); //�򿪻򴴽�һ���ļ�
	begin =  0x78F0B008;              //dex��ַ
	end = begin + 0x941fc;            //dex��ַ + dex�ļ���С
	for ( dexbyte = begin; dexbyte < end;dexbyte ++ )
	{
		fputc(Byte(dexbyte), fp);     //���ֽڽ���dump�������ļ���
	}
	fclose(fp); //�ر��ļ����
        Message("\nDump Dex files succeeded: %s. \n--Coded by B.S.\n\n", path);
}